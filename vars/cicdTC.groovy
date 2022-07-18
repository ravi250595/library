def newGit(repo)
{
  try
  {
    git "${repo}"
  }
  catch(Exception e1)
  {
     mail bcc: '', body: 'jenkins is not able to download', cc: '', from: '', replyTo: '', subject: 'continuous download failed', to: 'polamarasettiravi96@gmail.com'
    exit(1)
  }
}
