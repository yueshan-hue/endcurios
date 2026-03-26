End Curios Project - Setup Guide

Project: End Curios
Location: E:\endfield\endcurios

Mod Info:
- mod_id: endcurios
- mod_name: End Curios
- version: 1.0.0
- group_id: com.endcurios.endcurios
- authors: EndCurios Team
- description: End Field Curios API Integration Mod

Environment:
- Minecraft: 1.21.1
- NeoForge: 21.1.218
- Java: 21

Build Commands:
- .\gradlew build (build mod)
- .\gradlew runClient (start game)
- .\gradlew clean (clean cache)

TODO:
- Download Curios API jar manually from CurseForge
- Place in libs/ folder
- Add local dependency in build.gradle


=========================================
当前未完成的工作:
=========================================

1. 【紧急】Curios API 依赖问题
   状态：失败
   原因：maven.theillusivec4.top 无法访问
   CurseMaven 也返回 404
   
   解决方案（选择其一）：
   a) 手动下载：
      - 访问 curseforge.com/minecraft/mc-mods/curios/files
      - 下载 curios-neoforge-9.4.2+1.21.1.jar
      - 放到 libs/ 目录
      - 修改 build.gradle 使用本地依赖
   
   b) 等待网络恢复后重试
   c) 检查代理设置是否正确

2. 【待办】build.gradle 配置优化
   - 需要添加 Curios API 依赖（本地或远程）
   - 建议添加阿里云镜像加速
   - 可能需要调整 TLS 协议配置

3. 【可选】清理 C 盘空间
   - 之前已清理到 4GB
   - 如继续构建失败，可能需要更多空间

=========================================
构建历史:
=========================================
- 多次尝试在线下载 Curios API 均失败
- 尝试过 CurseMaven (各种 File ID)
- 尝试过官方 Maven (无法访问)
- 尝试过直接下载 (403 禁止)
- TLS 协议配置已添加但仍未成功

建议：优先手动下载 JAR 文件解决依赖问题
=========================================
