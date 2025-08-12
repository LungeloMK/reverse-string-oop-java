/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reversestringoop;


class StringReverser {
    private String text;

    public StringReverser(String text) {
        this.text = text;
    }

    public String reverse() {
        char[] chars = text.toCharArray();
        String reversed = "";

        for (int i = chars.length - 1; i >= 0; i--) {
            reversed += chars[i]; // building string manually
        }

        return reversed;
    }

    public void displayReversed() {
        System.out.println("Reversed string: " + reverse());
    }
}

