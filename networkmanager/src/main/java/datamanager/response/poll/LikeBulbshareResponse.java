package datamanager.response.poll;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LikeBulbshareResponse {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("code")
    @Expose
    private Integer code;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
