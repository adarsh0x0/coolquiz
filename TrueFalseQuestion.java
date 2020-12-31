import java.awt.*;
import javax.swing.*;

public class TrueFalseQuestion extends Question {
	String ask() {
		question.setVisible(true);

//		while (true) {
//			String answer = JOptionPane.showInputDialog(question);
//			answer = answer.toUpperCase();
//
//			boolean valid = (answer.equals("TRUE") || answer.equals("FALSE") || answer.equals("F") || answer.equals("N")
//					|| answer.equals("NO") || answer.equals("T") || answer.equals("Y") || answer.equals("YES"));
//
//			if (valid) {
//				if (answer.equals("F") || answer.equals("N") || answer.equals("NO")) {
//					answer = "FALSE";
//				}
//				if (answer.equals("T") || answer.equals("Y") || answer.equals("YES")) {
//					answer = "TRUE";
//				}
//				return answer;
//			}
//
//			JOptionPane.showMessageDialog(null, "Invalid answer. Please enter TRUE or FALSE.");
//		}
		return question.answer;
	}
	

	TrueFalseQuestion(String question, String answer) {
		super(question);

//		this.question = "TRUE or FALSE: " + question;
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel("    "+question+"    ",JLabel.CENTER));
		JPanel buttons = new JPanel();
		
		addButton(buttons,"TRUE");
		addButton(buttons,"FALSE");
		this.question.add(buttons);
		
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
		
		initQuestionDialog();
		

		correctAnswer = answer.toUpperCase();

	}
	
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
	}

	
}
