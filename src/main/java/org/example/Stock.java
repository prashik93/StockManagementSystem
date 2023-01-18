package org.example;

public class Stock {
    String shareName;
    int numberOfShare;
    int sharePrice;
    int buyingSharePrice;

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public int getNumberOfShare() {
        return numberOfShare;
    }

    public void setNumberOfShare(int numberOfShare) {
        this.numberOfShare = numberOfShare;
    }

    public int getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(int sharePrice) {
        this.sharePrice = sharePrice;
    }

    public int getBuyingSharePrice() {
        return buyingSharePrice;
    }

    public void setBuyingSharePrice(int buyingSharePrice) {
        this.buyingSharePrice = numberOfShare * sharePrice;
    }

    @Override
    public String toString() {
        return "{" + "\n\t" +
                "shareName='" + shareName + '\'' + ", " + "\n\t" +
                "numberOfShare=" + numberOfShare + ", " + "\n\t" +
                "sharePrice=" + sharePrice + ", " + "\n\t" +
                "buyingSharePrice=" + buyingSharePrice + "\n" +
                '}';
    }
}
