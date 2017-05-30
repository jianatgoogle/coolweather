package util;

/**
 * Created by hgs on 2017/5/28.
 */

public interface HttpCallbackListener {

    void onFinish(String response);

    void onError(Exception e);

}