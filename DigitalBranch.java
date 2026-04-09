import java.util.Objects;

public class DigitalBranch extends BankBranch{
    private String websiteUrl;

    public DigitalBranch(String branchName,String url){
        super(branchName);

        this.websiteUrl = url;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DigitalBranch that = (DigitalBranch) o;
        return Objects.equals(websiteUrl, that.websiteUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(websiteUrl);
    }
}
