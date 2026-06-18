import java.util.Scanner;

public class ResumeMatch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter resume skills separated by commas:");
        String resumeInput = sc.nextLine();

        String[] resumeSkills = resumeInput.split(",");

        String[] jobSkills = {"Java", "MySQL", "Spring Boot"};  // predefined job skills

        int matchCount = 0;

        for (String jobSkill : jobSkills) {
            for (String resumeSkill : resumeSkills) {
                if (jobSkill.trim().equalsIgnoreCase(resumeSkill.trim())) {
                    matchCount++;
                    break;
                }
            }
        }

        double matchPercentage = (double) matchCount / jobSkills.length * 100;

        System.out.println("Matched Skills: " + matchCount);
        System.out.println("Match Percentage: " + matchPercentage + "%");

        sc.close();
    }
}