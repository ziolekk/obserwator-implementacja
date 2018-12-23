package notify;

import crypto.BitcoinValueInDollars;

public interface Observer {

    void update(BitcoinValueInDollars bitcoinValueInDollars);
}
