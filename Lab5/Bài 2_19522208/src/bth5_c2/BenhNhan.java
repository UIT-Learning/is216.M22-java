/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bth5_c2;

/**
 *
 * @author 84346
 */
public class BenhNhan {
    private String MaBN;
    private String TenBN;

    public BenhNhan() {
    }

    public BenhNhan(String MaBN, String TenBN) {
        this.MaBN = MaBN;
        this.TenBN = TenBN;
    }

    public String getMaBN() {
        return MaBN;
    }

    public void setMaBN(String MaBN) {
        this.MaBN = MaBN;
    }

    public String getTenBN() {
        return TenBN;
    }

    public void setTenBN(String TenBN) {
        this.TenBN = TenBN;
    }
    
    @Override
    public String toString()
    {
        return TenBN;
    }
}
