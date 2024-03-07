/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.iii
 */
package dp_lab3;
import java.util.Scanner;


interface DocumentTemplate extends Cloneable {
    public DocumentTemplate makeCopy();
}

class Article implements DocumentTemplate {
    
    @Override
     public DocumentTemplate makeCopy() {
        System.out.println("Writing an Article....");
        Article articale = null;
        try {
        articale = (Article) super.clone();
        }
        catch (CloneNotSupportedException e) {
        e.printStackTrace();
        }
        return articale ;
     }
}


class Report implements DocumentTemplate {
     @Override
     public DocumentTemplate makeCopy() {
        System.out.println("Writing an Article....");
        Report report = null;
        try {
        report = (Report) super.clone();
        }
        catch (CloneNotSupportedException e) {
        e.printStackTrace();
        }
        return report ;
     }
}

 class CloneFactory {
public DocumentTemplate getClone(DocumentTemplate docType) {
return docType.makeCopy();
}
}

public class DocumentGenerationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose the type of document to create:");
        System.out.println("1. Article");
        System.out.println("2. Report");
        System.out.print("Enter your choice (1 or 2): ");
        
        int choice = scanner.nextInt();
        scanner.nextLine();
        
        DocumentTemplate documentTemplate = null;
        
        if (choice == 1) {
            documentTemplate = new Article();
        } else if (choice == 2) {
            documentTemplate = new Report();
        } else {
            System.out.println("Invalid choice. Exiting program.");
            System.exit(0);
        }
        
    }
}


