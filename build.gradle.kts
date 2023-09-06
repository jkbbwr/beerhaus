plugins {
    kotlin("jvm") apply false
    id("com.autonomousapps.dependency-analysis")
}

// be strict about dependency issues
dependencyAnalysis {
    issues {
        all {
            onAny {
                severity("fail")
            }
        }
    }
}