/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Carlo
 */
public class Cliente extends Persona {
    private String nit;
    public Cliente(){}

    public Cliente(String nit, String nombres, String apellidos, String direccion, String telefono, String nacimiento) {
        super(nombres, apellidos, direccion, telefono, nacimiento);
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    

    @Override
    public void agregar(){
    System.out.println("Nit: " + getNit());
    System.out.println("Nombres: " + getNombres());
    System.out.println("Apellidos: " + getApellidos());
    System.out.println("Direccion: " + getDireccion());
    System.out.println("Telefono: " + getTelefono());
    System.out.println("Nacimiento: " + getNacimiento());
    System.out.println("------------------------------------");


    }
            
            
            }
