import org.scalatest._

class ApplicationSpec extends FlatSpec with Matchers {

  "Hello" should "have tests" in {
    true should === (true)
  }

}
