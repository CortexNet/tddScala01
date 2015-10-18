package cortex

import org.scalatest.{ShouldMatchers, FunSpec}

class AlbumTest extends FunSpec with ShouldMatchers{
  describe("An album"){
    it("can add an Artist object to the album") {
      val album = new Album("Thriller", 1981, new Artist("Michael", "Jackson"))
      album.artist.firstName should be ("Michael")
    }
  }
}
