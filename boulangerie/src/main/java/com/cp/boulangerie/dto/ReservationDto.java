package com.cp.boulangerie.dto;

import java.util.Date;

public class ReservationDto implements Comparable<ReservationDto> {

    private ClientDto clientDto = new ClientDto();
    private ProduitDto produitDto = new ProduitDto();
    private Date dateReservation;
    private Date dateRetrait;

    public ClientDto getClientDto() {
        return clientDto;
    }

    public void setClientDto(ClientDto clientDto) {
        this.clientDto = clientDto;
    }

    public ProduitDto getProduitDto() {
        return produitDto;
    }

    public void setProduitDto(ProduitDto produitDto) {
        this.produitDto = produitDto;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Date getDateRetrait() {
        return dateRetrait;
    }

    public void setDateRetrait(Date dateRetrait) {
        this.dateRetrait = dateRetrait;
    }


    @Override
    public int compareTo(ReservationDto o) {
        return dateRetrait.compareTo(o.getDateRetrait());
    }
}
