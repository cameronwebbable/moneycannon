import com.webbengineering.blahblah.shared.CoinGeckoApi
import kotlinx.coroutines.runBlocking
import kotlin.test.Test
import kotlin.test.assertTrue

class CoinGeckoApiTest {
    @Test
    fun testCoinList() {
        runBlocking {
            val list = CoinGeckoApi().coinList()
            assertTrue {
                list.count() > 0
            }
        }
    }

    @Test
    fun testCoinMarketList() {
        runBlocking {
            val list = CoinGeckoApi().coinsMarket()
            assertTrue {
                list.count() > 0
            }
        }
    }
}