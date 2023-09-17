// https://nuxt.com/docs/api/configuration/nuxt-config
export default defineNuxtConfig({
  devtools: { enabled: true },
  modules: ['nuxt-graphql-client','@nuxthq/ui'],
  runtimeConfig: {
    public: {
      GQL_HOST: 'http://localhost:8080/graphql' 

    }
  }
})
