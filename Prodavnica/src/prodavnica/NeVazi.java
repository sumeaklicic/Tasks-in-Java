/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package prodavnica;

/**
 *
 * @author Korisnik
 */
public class NeVazi extends Exception {

    /**
     * Creates a new instance of <code>NeVazi</code> without detail message.
     */
    public NeVazi() {
    }

    /**
     * Constructs an instance of <code>NeVazi</code> with the specified detail
     * message.
     *
     * @param msg the detail message.
     */
    public NeVazi(String msg) {
        super(msg);
    }
}
