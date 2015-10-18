package cortex

import org.scalatest.{ShouldMatchers, FunSpec}

/**
 * Created by awu on 10/18/2015.
 */
class AlbumTest extends FunSpec with ShouldMatchers{
  describe("An album"){
    it("can add an Artist object to the album") {
      val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))
    }
  }
}
