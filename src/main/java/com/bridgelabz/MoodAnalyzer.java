package com.bridgelabz;

import com.bridgelabz.MyException.Message;

public class MoodAnalyzer {
	String message;

	/* Parameterized constructor */
	public MoodAnalyzer(String message) {
		this.message = message;
	}

	/* Default constructor */
	public MoodAnalyzer() {
	}

	/* this method will return Mood(HAPPY/SAD) according to the message given */
	public String analyzeMood() throws MyException {
		try {
			if (message.toLowerCase().contains("sad"))
				message = "SAD";
			else if (message.toLowerCase().contains("happy"))
				message = "HAPPY";
			else
				throw new MyException(Message.EMPTY);
			return message;
		} catch (NullPointerException e) {
			throw new MyException(Message.NULL);
		} 
	}
	
	

	public static void main(String[] args) {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

		try {
			System.out.println(moodAnalyzer.analyzeMood());
		} catch (MyException e) {
			System.out.println("Invalid Mood Entered!!!");
		}

		try {
			moodAnalyzer.message = "I'm in Sad mood!!!";
			System.out.println(moodAnalyzer.analyzeMood());
		} catch (MyException e) {
			System.out.println("Invalid Mood Entered!!!");
		}

		try {
			moodAnalyzer.message = "I'm happy!!!";
			System.out.println(moodAnalyzer.analyzeMood());
		} catch (MyException e) {
			System.out.println("Invalid Mood Entered!!!");
		}

		try {
			moodAnalyzer.message = "";
			System.out.println(moodAnalyzer.analyzeMood());
		} catch (MyException e) {
			System.out.println("Invalid Mood Entered!!!");
		}
	}

}