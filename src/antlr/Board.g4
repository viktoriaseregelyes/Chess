grammar Board;

board: size ' ' piecePlacement ' ' nextPlayer;

size: INT;
piecePlacement: (rank line)*;
rank: (pieceOnBoard)* digit*;
pieceOnBoard: digit piece | piece;
piece: whitePiece | blackPiece;
digit: INT;
whitePiece: 'P' | 'N' | 'B' | 'R' | 'Q' | 'K';
blackPiece: 'p' | 'n' | 'b' | 'r' | 'q' | 'k';

nextPlayer: 'w' | 'b';

line: '/';

INT: [0-9]+ ;