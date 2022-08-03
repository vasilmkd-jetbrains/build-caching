scalaVersion := "2.13.8"

pushRemoteCacheTo := Some(MavenCache("local-cache", file("/tmp/remote-cache")))
pushRemoteCacheConfiguration := (Compile / pushRemoteCacheConfiguration).value.withOverwrite(true)
