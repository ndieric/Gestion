package com.example.Gestion_Back.Dto;



public class ProduitDto {
    private Long quantity;
    private Long price;
    private Long montant_total;
    public ProduitDto() {
    }
    public ProduitDto(Long quantity, Long price, Long montant_total) {
        this.quantity = quantity;
        this.price = price;
        this.montant_total = montant_total;
    }
    public Long getQuantity() {
        return quantity;
    }
    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }
    public Long getPrice() {
        return price;
    }
    public void setPrice(Long price) {
        this.price = price;
    }
    public Long getMontant_total() {
        return montant_total;
    }
    public void setMontant_total(Long montant_total) {
        this.montant_total = montant_total;
    }
    @Override
    public String toString() {
        return "ProduitDto [montant_total=" + montant_total + ", price=" + price + ", quantity=" + quantity + "]";
    }
    

    
    

    

    

    
}
