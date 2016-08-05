//package com.bodmas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BodmasRuleEvaluation {
	
	public static void main(String[] args) {

		BufferedReader br = null;
		String inputFile = "C:\\Users\\Kiran\\Desktop\\BodamasFile.txt";
		try {

			String expression;

			br = new BufferedReader(new FileReader(inputFile));

			while ((expression = br.readLine()) != null) {
				if (!expression.isEmpty())
					System.out.println(expression + " : " + EvaluateString.evaluate(expression));
					//System.out.println(expression + " : " + Evaluate.evaluate(expression));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}

}
