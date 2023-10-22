grammar Move;

moves: general_role piece_role;

general_role: 'general role:' role*;
piece_role: (piece ' role:' role*)*;

role: action 'if' event;
action: HIT;
event: ;
directions: RIGHT | LEFT | BACK | FORWARD;

// általános szabály: ütés után újra lépés
// külön bábukra szabály:
// -bábu lépése:
//      -alaplépés: 1 előre 2 jobbra            // limitált
//      -alaplépés: előre hátra jobbra balra    // korlátlan (amíg tart a pálya/bábu van)
// hogy kéne, ha egy eventre máshogy kell reagálnia
//      -definiálni, hogy milyen lehetséges eventek vannak

piece: PAWN | KNIGHT | BISHOP | ROOK | QUEEN | KING;

HIT: 'hit';
RIGHT: 'right';
LEFT: 'left';
BACK: 'back';
FORWARD: 'forward';

INT: DIGIT+;
DIGIT: [0-9];

PAWN: 'pawn';
KNIGHT: 'knight';
BISHOP: 'bishop';
KING: 'king';
QUEEN: 'queen';
ROOK: 'rook';

WS: (' '| '\t' | '\n' | '\r') -> skip;

