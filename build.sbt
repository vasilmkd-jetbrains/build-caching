ThisBuild / scalaVersion := "2.13.8"

ThisBuild / pushRemoteCacheTo := Some(MavenCache("compilation-cache", (ThisBuild / baseDirectory).value / "compilation-cache"))

val gitHeadSum = scala.sys.process.Process("git rev-parse HEAD").!!.trim.take(7)

lazy val `build-caching` = project.in(file("."))
  .settings(
    Compile / remoteCacheId := gitHeadSum,
    Compile / pushRemoteCacheConfiguration ~= (_.withOverwrite(true)),
    Test / remoteCacheId := gitHeadSum,
    Test / pushRemoteCacheConfiguration ~= (_.withOverwrite(true))
  )
