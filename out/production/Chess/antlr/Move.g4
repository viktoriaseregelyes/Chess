grammar Move;

moves: all_piece_rule piece_rule*;

all_piece_rule: 'all piece rule:' rule*;
piece_rule: piece ' rule:' general_rule rule*;
general_rule: 'general move:' move_more;

move_more: move (', ' move )*;
move: (INT directions)* (directions)*;
rule: '-' (action 'when' event | move_anywhere);
action: move_again | move_dir | become_piece;
event: HIT;
directions: RIGHT | LEFT | BACKWARD | FORWARD;
move_again: MOVE AGAIN;
move_dir: MOVE directions;
become_piece: BECOME piece;
move_anywhere: MOVE 'anywhere ' INT ' times in the game';

piece: PAWN | KNIGHT | BISHOP | ROOK | QUEEN | KING;

HIT: 'hit';
RIGHT: 'right';
LEFT: 'left';
BACKWARD: 'backward';
FORWARD: 'forward';
AGAIN: 'again';
MOVE: 'move';
BECOME: 'become';

INT: DIGIT+;
DIGIT: [0-9];

PAWN: 'pawn';
KNIGHT: 'knight';
BISHOP: 'bishop';
KING: 'king';
QUEEN: 'queen';
ROOK: 'rook';

WS: (' '| '\t' | '\n' | '\r') -> skip;

