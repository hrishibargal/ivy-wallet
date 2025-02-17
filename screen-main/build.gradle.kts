plugins {
    id("ivy.feature")
}

android {
    namespace = "com.ivy.main"
}

dependencies {
    implementation(projects.ivyBase)
    implementation(projects.ivyDomain)
    implementation(projects.ivyResources)
    implementation(projects.ivyDesign)
    implementation(projects.ivyNavigation)
    implementation(projects.ivyDomainUi)
    implementation(projects.ivyPersistence)

    implementation(projects.screenHome)
    implementation(projects.screenAccounts)

    implementation(projects.tempOldDesign)
    implementation(projects.tempLegacyCode)
}