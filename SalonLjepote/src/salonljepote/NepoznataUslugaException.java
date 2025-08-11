/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package salonljepote;

/**
 *
 * @author Korisnik
 */
public class NepoznataUslugaException extends Exception {

    /**
     * Creates a new instance of <code>NepoznataUslugaException</code> without
     * detail message.
     */
    public NepoznataUslugaException() {
    }

    /**
     * Constructs an instance of <code>NepoznataUslugaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NepoznataUslugaException(String msg) {
        super(msg);
    }
}
