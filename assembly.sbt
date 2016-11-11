import sbt.Keys._

// ---------------------
// Settings
// ---------------------

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", "io.netty.versions.properties") => MergeStrategy.concat
  case x =>
    val oldStrategy = (assemblyMergeStrategy in assembly).value
    oldStrategy(x)
}

assemblyOutputPath in assembly := file(s"../${name.value}_${scalaBinaryVersion.value}-${version.value}.jar")

test in assembly := {}

// -----------------------
// Custom settings
// -----------------------
