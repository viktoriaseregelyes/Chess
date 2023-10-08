grammar Board;

board: size ' ' piecePlacement ' ' nextPlayer;

size: INT;
piecePlacement: (rank '/')*;
rank: digit17* (piece digit17* piece*)* | size;
piece: whitePiece | blackPiece;
digit17: INT;
whitePiece: 'P' | 'N' | 'B' | 'R' | 'Q' | 'K';
blackPiece: 'p' | 'n' | 'b' | 'r' | 'q' | 'k';

nextPlayer: 'w' | 'b';

INT: [0-9]+ ;