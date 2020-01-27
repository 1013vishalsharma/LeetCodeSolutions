package com.Solution;

import java.util.HashSet;

public class Solution36 {

	public boolean isValidSudoku(char[][] board) {

		HashSet<Character> s1 = new HashSet<>();

		for (int i = 0; i < board.length; i++) {
			s1.clear();
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == '.') {
					continue;
				} else {
					if (s1.contains(board[i][j])) {
						return false;
					} else {
						s1.add(board[i][j]);
					}
				}
			}
		}

		for (int i = 0; i < board.length; i++) {
			s1.clear();
			for (int j = 0; j < board.length; j++) {
				if (board[j][i] == '.') {
					continue;
				} else {
					if (s1.contains(board[j][i])) {
						return false;
					} else {
						s1.add(board[j][i]);
					}
				}
			}
		}

//		for (int i = 0; i < board.length; i++) {
//			for (int j = 0; j < board.length; j++) {
//				System.out.print(board[i][j] + " ");
//			}
//			System.out.println();
//		}

		int x = 0, y = 0;
		
		for (x = 0; x < 9; x=x+3) {
			for (y = 0; y < 9; y=y+3) {
				s1.clear();
				for (int i = x; i < x + 3; i++) {
					for (int j = y; j < y + 3; j++) {
						if (board[i][j] == '.') {
							continue;
						} else {
							if (s1.contains(board[i][j])) {
								return false;
							} else {
								s1.add(board[i][j]);
							}
						}
					}
				}
			}
		}

		// 00, 01, 02, 03, 04
		// 10, 11, 12, 13, 14
		// 20, 21, 22, 23, 24

		return true;
	}

	public static void main(String[] args) {
		Solution36 sol = new Solution36();
		char[][] board = { { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' }, { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' }, { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' }, { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' }, { '.', '.', '.', '.', '8', '.', '.', '7', '9' } };

		System.out.println(sol.isValidSudoku(board));
	}

}
