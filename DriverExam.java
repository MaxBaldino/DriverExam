
public class DriverExam {

	private char[] correctAnswers = new char[20];
	
	public double totalCorrect(char[] studentAnswers) {
		int correct = 0;
		for (int i = 0; correctAnswers.length < i; i++) {
			if (studentAnswers[i] == correctAnswers[i]) {
				correct++;
			}
		}
		return correct/correctAnswers.length;
	}
	
	public boolean passed(char[] studentAnswers) {
		if (totalCorrect(studentAnswers) >= 0.75) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void Main(String[] args) {
		
	}
}
