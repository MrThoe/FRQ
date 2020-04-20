
public class MusicDownloads
{
    /** The list of downloaded information
     *  Guaranteed not to be null and not to contain duplicate titles
     */
     
     private List<DownloadInfo> downloadList;
     
     /**Creates the list of downloaded information */
     public MusicDownloads()
     {  downloadList = new ArrayList<DownloadInfo>(); }
     
     /** Returns a reference to the DownloadInfo object with the requested titles if it exists.
      *  @param title the requested title
      *  @return a reference to the DownloadInfo object with the
      *     title that matches the parameter title if it exists in the list;
      *     null otherwise
      *   POSTCONDITION:
      *     - No changes were made to  downloadList.
      */
      public DownloadInfo getDownloadInfo(String title)
      {  /** to be implemented in part(a) */ }
    
    public void updateDownloads(List<String> titles)
    { /* to be implemented in part(b) */ }
    
    //There may be instance variables, constructors, and methods that are not shown
}
      
