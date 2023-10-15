grammar Board;

board: size piecePlacement nextPlayer;

size: 'board size is: ' INT;
piecePlacement: 'piece(s) on the board is:' pieceOnBoard*;
pieceOnBoard: player piece ' is at ' INT 'row' INT 'column';
piece: PAWN | KNIGHT | BISHOP | ROOK | QUEEN | KING;
nextPlayer: 'next player is: ' player;
player: WHITE | BLACK;

//absztrakt összedobása

INT: DIGIT+;
DIGIT: [0-9];

WHITE: 'white';
BLACK: 'black';
PAWN: 'pawn';
KNIGHT: 'knight';
BISHOP: 'bishop';
KING: 'king';
QUEEN: 'queen';
ROOK: 'rook';

WS: (' '| '\t' | '\n' | '\r') -> skip;

