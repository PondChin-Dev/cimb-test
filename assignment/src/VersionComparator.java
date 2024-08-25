public class VersionComparator {
    public int compareVersions(String version1, String version2) {
        // แยกตาม . 
        String[] parts1 = version1.split("\\.");
        String[] parts2 = version2.split("\\.");
        
        int len1 = parts1.length;
        int len2 = parts2.length;
        int maxLength = Math.max(len1, len2);
        
        for (int i = 0; i < maxLength; i++) {
            // เช็คว่ามี.ที่สามารถเทียบได้ไหม
            int v1 = i < len1 ? Integer.parseInt(parts1[i]) : 0;
            int v2 = i < len2 ? Integer.parseInt(parts2[i]) : 0;
            
            if (v1 < v2) {
                return -1;
            } else if (v1 > v2) {
                return 1;
            }
        }
        
        return 0;
    }
}
