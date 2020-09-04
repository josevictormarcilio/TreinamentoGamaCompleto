package br.marcilio.springsample02.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "departamento") //mapear qual tabela eu me refiro
public class Departamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddepto") //mapear nome do campo no java na tabela do BD
    private int id;

    @Column(name = "nomedep", length = 50) //mapear nome do campo no java na tabela do BD
    private String nome;

    @Column(name = "andar") //mapear nome do campo no java na tabela do BD
    private int andar;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    
}