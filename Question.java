import java.awt.*;
import javax.swing.*;

public class Question {

	QuestionDialog question;
	String correctAnswer;

	static int nQuestions = 0;
	static int nCorrect = 0;
	
	String ask() {
		question.setVisible(true);
		return question.answer;
	}
	
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel("    " + question + "    ", JLabel.CENTER));
	}

	void check() {

		nQuestions++;
		String answer = ask();

		if (answer.equals(correctAnswer)) {
			JOptionPane.showMessageDialog(null, "Correct!");

			nCorrect++;

		} else {
			JOptionPane.showMessageDialog(null, "Incorrect. The correct answer is " + correctAnswer + ".");
		}

	}

	static void showResults() {
		JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions.");
	}
	
	void initQuestionDialog() {
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
		
	}
	
}
