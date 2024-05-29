package com.cp.boulangerie.dto;

public class AdresseDto implements Comparable<AdresseDto>{

    private Long id;
    private String rue;
    private String codePostal;
    private String ville;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public int compareTo(AdresseDto o) {
        return rue.compareToIgnoreCase(o.getRue());
    }
}
