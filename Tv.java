/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author maria
 */
public class Tv {
    public static void main(String[] args){
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();
        
        tv1.turnOn();
        tv2.turnOn();
        
        tv1.setChannel(30);
        tv1.setVolume(3);
        
        System.out.println("Tv1's channel is "+tv1.channel);
        System.out.println("Number of Tvs on: "+numberOfTvs);
    }
        int channel = 1; //default channel
        int volumeLevel = 1; //default
        boolean on = false; //tv is off
        
        static int numberOfTvs = 0; //all instances share data with static variables
        //also known as class variables
        
        public Tv(){
        
        }
        public void turnOn(){
            on = true;
            numberOfTvs++;
        }
        public void turnOff(){
            on = false;
        }
        static int getNumberOfTvs(){
            return numberOfTvs;
        }
        public void setChannel(int newChannel){
            if(on && newChannel >= 1 && newChannel <= 120){
                channel = newChannel;
            }
        }
        public void setVolume(int newVolumeLevel){
            if(on && newVolumeLevel >= 1 && newVolumeLevel <=7){
                volumeLevel = newVolumeLevel;
            }
        }
        public void channelUp(){
            if(on && channel < 120){
                channel++;
            }
        }
        public void channelDown(){
            if(on && channel > 1){
                channel--;
            }
        }
        
        public void VolumeUp(){
            if(on && volumeLevel < 7){
                volumeLevel++;
            }
        }
        public void VolumeDown(){
            if(on && volumeLevel > 1){
                volumeLevel--;
            }
        } 
}
