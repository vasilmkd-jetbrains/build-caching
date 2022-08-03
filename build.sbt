scalaVersion := "2.13.8"

pushRemoteCacheTo := Some(MavenCache("local-cache", file("/tmp/remote-cache")))
remoteCacheId := "blah"
remoteCacheIdCandidates := Seq(remoteCacheId.value)
pushRemoteCacheConfiguration := (Compile / pushRemoteCacheConfiguration).value.withOverwrite(true)
