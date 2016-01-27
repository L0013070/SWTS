/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swts1;

/**
 *
 * @author L00131070
 */
public class SWTS1 {
    
    private int data1;
    private int data2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SWTS1 instance = new SWTS1();
        System.out.println(instance);
        instance.setData1(10);
        instance.setData2(20);
        System.out.println(instance);
    }

    /**
     * @return the data1
     */
    public int getData1() {
        return data1;
    }

    /**
     * @param data1 the data1 to set
     */
    public void setData1(int data1) {
        this.data1 = data1;
    }

    /**
     * @return the data2
     */
    public int getData2() {
        return data2;
    }

    /**
     * @param data2 the data2 to set
     */
    public void setData2(int data2) {
        this.data2 = data2;
    }
    
    public String toString() {
        return "data1: "+getData1()+" data2: "+getData2();
    }
    
}
