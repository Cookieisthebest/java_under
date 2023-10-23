package test;

import java.util.ArrayList;
import java.util.Scanner;
import vn.edu.ptit.Invoice;
import vn.edu.ptit.Rule;
import vn.edu.ptit.Student;
import vn.edu.ptit.Subject;

class PaymentController {
    Scanner sc = new Scanner(System.in);
    public PaymentController()
    {
      
    }
    public Invoice getInvoice(){
        String code = sc.nextLine(); //ma sinh vien
        String name = sc.nextLine();//ten sinh vien
        Student student = new Student(code, name);
        
        int totalSubject = Integer.parseInt(sc.nextLine());
        int counter = 0;
        ArrayList<Subject> subject = new ArrayList<>();
        for(int i = 0;i < totalSubject;i++){
            String subjectCode = sc.nextLine();
            String subjectName = sc.nextLine();
            int total = Integer.parseInt(sc.nextLine());
            counter += total;
            subject.add(new Subject(subjectName, subjectCode, total));
        }
        
        String ruleCode = sc.nextLine();
        String ruleName = sc.nextLine();
        double tuition = Double.parseDouble(sc.nextLine());
        Rule rule = new Rule(ruleCode, ruleName, tuition);
        
        Invoice a = new Invoice(rule);
        a.setSt(student);
        a.setAlSubject(subject);
        a.setAmount(tuition * counter);
        return a;
    }
}
