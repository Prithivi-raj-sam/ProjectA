package com.chainsys.springproject.beans;

public class ScoreBoard {
	public int targetScore;
	private ScoreBoard() {
		System.out.println("ScoreBoard object is created "+ targetScore +" " + hashCode());
	}
	private ScoreBoard(int runs) {
		targetScore=runs;
		System.out.println("ScoreBoard object is created "+ targetScore +" " +hashCode());
	}
	// factory methods -the both are static here
	public static ScoreBoard createObject(int runs) {
		return new ScoreBoard(runs);
	}
	public static ScoreBoard createObject() {
		return new ScoreBoard();
	}
}
