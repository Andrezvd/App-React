import Link from 'next/link'
import Layout from '../components/Layout'
import MiComponente from '../components/api'

const IndexPage = () => (
  <Layout title="Home">
    <h1>Hello cabezona de mi corazon 👋</h1>
    <p>
      <Link href="/about">About</Link>
    </p>
    <MiComponente></MiComponente>
  </Layout>
)

export default IndexPage
