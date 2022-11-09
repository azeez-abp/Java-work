package design_pattern.srtuctural.bridge;

// this is the QuestionManager class. use the interface
public class QuestionManager  {
    protected Question q;///as property
    public String catalog;
    public QuestionManager(String catalog) {
        this.catalog=catalog;
    }
    public void next() {
        q.nextQuestion();
    }
    public void previous() {
        q.previousQuestion();
    }
    public void newOne(String quest) {
        q.newQuestion(quest);
    }
    public void delete(String quest) {
        q.deleteQuestion(quest);
    }
    public void display() {
        q.displayQuestion();
    }
    public void displayAll() {
        System.out.println("Question Paper: " + catalog);
        q.displayAllQuestions();
    }
}// End of the QuestionManager class.
//Step 4
      //  Create a QuestionFormat class that will extend the QuestionManager class

// this is the QuestionFormat class.
 class QuestionFormat extends QuestionManager {
    public QuestionFormat(String catalog){
        super(catalog);
    }
    public void displayAll() {
        System.out.println("\n---------------------------------------------------------");
        super.displayAll();
        System.out.println("-----------------------------------------------------------");
    }
}// End of the QuestionFormat class.