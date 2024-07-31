/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Cliente extends Persona {
    private String Nit;

    public String getNit() {
        return Nit;
    }

    public void setNit(String Nit) {
        this.Nit = Nit;
    }
    
    @Override
    public void agregar(){
    
    System.out.println("Nit: " + this.getNit());
    System.out.println("Nombres: " + this.getNombres());
    System.out.println("Apellidos: " + this.getApellidos());
    System.out.println("Direccion: " + this.getDireccion());
    System.out.println("Telefono: " + this.getTelefono());
    System.out.println("Fecha Nacimineto: " + this.getFecha_nacimiento());
    }
    
}
