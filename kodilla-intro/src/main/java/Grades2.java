public class Grades2 {
    private int size;
    private int[] grades;

    public static void main(String[] args) {
        Grades Grades2 = new Grades ();
    }

    public void addGrade(int value) {
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public void showLastGrade (){
        int lastGrade = grades.length;
            if (lastGrade <= 10) {
                System.out.println(lastGrade);
            }
    }
    public void Average (int sum){
        for (this.size = 0; this.size <= grades.length; this.size++) {
            sum = sum + this.grades[this.size];
            int average = (sum / grades.length);
                System.out.println("Average : " + average);
            }
    }
}