/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hci;

import cpit380practice.Picture;

public class Item {
    private int itemNo;
    private String itemName;
    private String itemType;
    private String itemNotes;
    private   Picture itemPicture;

    public Item( String itemName, String itemType, String itemNotes,Picture pic) {
        this.itemNo ++;
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemNotes = itemNotes;
        itemPicture=pic;
    }
   
    
    
}
