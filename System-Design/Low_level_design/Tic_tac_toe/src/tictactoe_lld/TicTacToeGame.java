package tictactoe_lld;

import java.util.*;

public class TicTacToeGame {
    private Deque<Player> players;
    private Board board;

    public TicTacToeGame() {
        initializeGame();
    }

    void initializeGame() {
        players = new LinkedList<>();

        Player player1 = new Player("Player1", new PieceX());
        Player player2 = new Player("Player2", new PieceO());

        players.add(player1);
        players.add(player2);

        board = new Board(3);
    }

    public String startGame() {
        while (true) {
            Player currentPlayer = players.pollFirst();
            board.displayBoard();

            List<Pair<Integer, Integer>> freeCells = board.getFreeCells();
            if (freeCells.isEmpty()) {
                return "tie";
            }

            System.out.println(currentPlayer.name + " - Enter your move (row,col):");
            Scanner scanner = new Scanner(System.in);
            String[] input = scanner.nextLine().split(",");

            int row = Integer.parseInt(input[0].trim());
            int col = Integer.parseInt(input[1].trim());

            boolean added = board.addPiece(row, col, currentPlayer.piece);
            if (!added) {
                System.out.println("Invalid move. Try again.");
                players.addFirst(currentPlayer);
                continue;
            }

            if (checkWinner(row, col, currentPlayer.piece.type)) {
                board.displayBoard();
                return currentPlayer.name + " wins!";
            }

            players.addLast(currentPlayer);
        }
    }

    private boolean checkWinner(int row, int col, PieceType type) {
        boolean rowWin = true, colWin = true;
        boolean diagWin = (row == col);
        boolean antiDiagWin = (row + col == board.size - 1);

        for (int i = 0; i < board.size; i++) {
            if (board.board[row][i] == null || board.board[row][i].type != type) rowWin = false;
            if (board.board[i][col] == null || board.board[i][col].type != type) colWin = false;
            if (diagWin && (board.board[i][i] == null || board.board[i][i].type != type)) diagWin = false;
            if (antiDiagWin && (board.board[i][board.size - 1 - i] == null || board.board[i][board.size - 1 - i].type != type)) antiDiagWin = false;
        }

        return rowWin || colWin || diagWin || antiDiagWin;
    }
} 
