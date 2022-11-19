package bridge;

import java.util.List;

public class Application {

    public static void main(String[] args) {
        int len = new InputView().readBridgeSize();
        List<String> bridge = new BridgeMaker(new BridgeRandomNumberGenerator()).makeBridge(len);
    }
}
