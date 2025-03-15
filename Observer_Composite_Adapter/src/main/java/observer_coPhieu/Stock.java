package observer_coPhieu;
// Subject
public interface Stock {
    void registerInvestor(Investor investor);
    void removeInvestor(Investor investor);
    void notifyInvestors();
}
