/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.java.pkg1;

/**
 *
 * @author Asus
 */
public class TaskJava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Biodata biodata = new Biodata();
        
        biodata.getFullName("Amalia Swastika Indra Prasetya");
        biodata.getPlaceBirth("Jakarta");
        biodata.getDateBirth(17, " Mei " , 2003);
        biodata.getHobby("Watching Movie");
        biodata.getZodiac("Taurus");
        biodata.getFavFood("Pizza");
        biodata.getDreams("Frontend Developer");
    }
    
}
