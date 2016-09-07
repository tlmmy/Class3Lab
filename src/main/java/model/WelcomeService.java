/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Calendar;

/**
 *
 * @author Tim
 */
public class WelcomeService {
    private Calendar date;

    public WelcomeService() {
        date = Calendar.getInstance();
    }
    
    public String checkTimePeriod(){
        Calendar morning = Calendar.getInstance();
        Calendar afternoon = Calendar.getInstance();
        morning.set(Calendar.HOUR, 11);
        afternoon.set(Calendar.HOUR, 4);
                
        if (date.before(morning)){
            return "morning";}
        
        else if(date.before(afternoon)){
                    return "afternoon";
                    }
        else{
            return "evening";
        }
    }
    
    public String createWelcomeMessage(String name){
        String timePeriod = this.checkTimePeriod();
        return "Good " + timePeriod + " " + name + ". Welcome!";
}

}